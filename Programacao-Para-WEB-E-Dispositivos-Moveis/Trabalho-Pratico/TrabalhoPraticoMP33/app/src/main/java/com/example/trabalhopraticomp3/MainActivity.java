package com.example.trabalhopraticomp3;

import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MediaPlayer.OnPreparedListener {

    Button btnPlay , btnStop, btnPause;
    SeekBar positionBar;
    TextView tvDuracaoInicial,tvTimeCurrent;
    MediaPlayer player,nextplayer;

    int totalMusica;
    long curentTime;
    boolean isPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        positionBar = findViewById(R.id.seekBar);
        //pegando os botoes
        btnPlay = findViewById(R.id.play);
        btnPause = findViewById(R.id.pause);
        btnStop = findViewById(R.id.stop);
        // pegando o textviw
        tvDuracaoInicial = findViewById(R.id.time);
        tvTimeCurrent = findViewById(R.id.timefinal);
        tvDuracaoInicial.setText("00:00");
        tvTimeCurrent.setText("00:00");

        // acoes do botao
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startPlay();
            }
        });
        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pausePlay();
            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlay();
            }
        });
}

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (player != null){
            player.stop();
            player.release();
            player= null;
        }
    }

// funcoes de player pause e stop
    void startPlay(){
        try {
            if (player == null){
                player = MediaPlayer.create(getApplicationContext(),R.raw.eletroninca);
            }else{
                isPlay = true;
                player.start();
                totalMusica = player.getDuration();
                SeekBarCurrent(positionBar,player);
                player.setOnPreparedListener(this);
            }
        }catch (Exception e ){
            e.printStackTrace();
        }
    }
    // configuracoes iniciais do SeekBar

    void SeekBarCurrent(final SeekBar seekBar ,final MediaPlayer mp){
        seekBar.setMax(mp.getDuration());
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            if (fromUser){
                mp.seekTo(progress);
                positionBar.setProgress(progress);
            }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        updateTimeThread(player,tvDuracaoInicial,tvTimeCurrent);

    }

    void pausePlay(){
        isPlay = false;
        try{

        if (player != null){
            player.pause();
        }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    void stopPlay(){
        isPlay = false;
        try{
        if (player != null){
            player.stop();
            player.release();
            player= null;
            curentTime = 0;
            tvDuracaoInicial.setText("00:00");
            tvTimeCurrent.setText("00:00");
        }

    }catch (Exception e ){
            e.printStackTrace();
        }
    }

    // funcao de thead para atualizar os minutos e secundos da musica
    void updateTime(final MediaPlayer mp, final TextView tvInicial, final TextView tvFinal){
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Message msg = new Message();
                msg.what= mp.getCurrentPosition();
                handler.sendMessage(msg);
            }
        });
    }

    void updateTimeThread(final MediaPlayer mp , final TextView tvinicial ,final TextView tvFinal){
        new Thread(){
            public void run(){
                while (isPlay){
                  try{
                      updateTime(mp,tvinicial,tvFinal);
                      Thread.sleep(1000);
                  }catch (Exception e ){
                      e.printStackTrace();
                  }
                }
            }
        }.start();
    }

    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            int currentPosition = msg.what;
            positionBar.setProgress(currentPosition);
            String elopedTime = createTimelabel(currentPosition);
            tvDuracaoInicial.setText(elopedTime);
            String remaingTime = createTimelabel(totalMusica-currentPosition);
            tvTimeCurrent.setText(remaingTime);
        }
    };

    public String createTimelabel(int time){
        int minutos, segundos;

        // Duracao da musica
        minutos = (int) (time/1000/60);
        segundos = (int) (time/1000%60);
        String sDruracao =  minutos<10 ? "0"+minutos: minutos+"";
        sDruracao +=  ":"+(segundos<10 ? "0"+segundos: segundos);

        return sDruracao;
    }

    @Override
    public void onPrepared(MediaPlayer mp) {
        Log.i("Script", "onPrepared");
        isPlay = true;
        mp.start();
        mp.setLooping(true);
        mp.seekTo((int)curentTime);
        //mp.setNextMediaPlayer(nextplayer);
        updateTimeThread(mp,tvDuracaoInicial,tvTimeCurrent);
    }
}

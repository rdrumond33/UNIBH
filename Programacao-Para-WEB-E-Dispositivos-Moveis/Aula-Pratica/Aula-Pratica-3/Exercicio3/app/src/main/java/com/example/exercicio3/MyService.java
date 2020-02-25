package com.example.exercicio3;


import android.app.Service;
import android.content.Intent;
import android.os.Environment;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;


public class MyService extends Service implements Runnable {

        private static final String TAG = "Servico";
        private boolean active;
        private int count;
        private static final int MAX = 50;

        @Override
        public IBinder onBind(Intent arg0) {
            return null;
        }

        @Override
        public void onCreate() {
            Toast.makeText(this, "Serviço Criado!", Toast.LENGTH_LONG).show();
            Log.d(TAG, "Método onCreate");
            active = true;
            new Thread(this).start();
        }

        @Override
        public void onStart(Intent intent, int startId) {
            Toast.makeText(this, "Serviço Iniciado!", Toast.LENGTH_LONG).show();
            Log.d(TAG, "Método onStart");
        }

        @Override
        public void onDestroy() {
            Toast.makeText(this, "Serviço Finalizado!", Toast.LENGTH_LONG).show();
            Log.d(TAG, "Método onDestroy");
            active = false;
        }

        @Override
        public void run() {
            while (active && count < MAX) {
                executeThread();
                Log.d(TAG, "Executando..." + count);
                gravarDados("Executando..." + count);
                count++;
            }
            Log.d(TAG, "FIM!!!");
            stopSelf();
        }

        private void executeThread() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    private void gravarDados(String texto) {
        String lstrNomeArq;
        File arq;
        byte[] dados;
        try {
            arq = new File(Environment.getExternalStorageDirectory(), "arqAndroid.txt");
            FileOutputStream fos;
            dados = texto.toString().getBytes();
            fos = new FileOutputStream(arq);
            fos.write(dados);
            fos.flush();
            fos.close();
            Log.d(TAG, "TEXTO SALVO COM SUCESSO!!!");
        } catch (Exception e) {
            Log.d(TAG, "FIM DA GRAVACAO!!!");
        }
    }
}

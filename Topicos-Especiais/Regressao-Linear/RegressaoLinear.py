""" Regressão Linear """

import csv


def calculate_standard_deviation(training, test):
    sum_x = 0
    sum_y = 0
    sum_pow_x = 0
    sum_x_y = 0
    result = []
    size = len(training)

    for coordinate in training:
        x, y = coordinate
        sum_x += x
        sum_y += y
        sum_pow_x += (x**2)
        sum_x_y += (x * y)

    b1 = ((sum_x * sum_y) - (size * sum_x_y)) / \
        ((sum_x**2) - (size * sum_pow_x))
    b0 = (sum_y - (b1 * sum_x)) / size

    deviation = 0

    for coordinate in test:
        x, yi = coordinate

        deviation += (yi - (b0 + (b1*x))) ** 2

    return deviation


def readData(file):
    data_set = []

    with open(file) as csvfile:
        readCSV = csv.reader(csvfile, delimiter=';')

        index = 0

        for row in readCSV:
            if index == 0:
                index = 1
                continue

            average = (float(row[3]) + float(row[4]) + float(row[5])) / 3
            row.append(average)
            data_set.append(row)

    return data_set


data = readData('./AtividadeRegressaoLinear/AnaliseEstudo.csv')

training_length = round(len(data) * 0.7)

training = data[:training_length]
test = data[training_length:]

# Idade;TempoEstudo;Faltas;Prova1;Prova2;Prova3

training_age = [(float(t[0]), float(t[6])) for t in training]
test_age = [(float(t[0]), float(t[6])) for t in test]

training_Stud = [(float(t[1]), float(t[6])) for t in training]
test_Stud = [(float(t[1]), float(t[6])) for t in test]

training_faltas = [(float(t[2]), float(t[6])) for t in training]
test_faltas = [(float(t[2]), float(t[6])) for t in test]


print(calculate_standard_deviation(training_age, test_age))

print(calculate_standard_deviation(training_Stud, test_Stud))

print(calculate_standard_deviation(training_faltas, test_faltas))

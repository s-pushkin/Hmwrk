package ru.mirea.practice.formatting.work1;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

abstract class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Choose a currency from which to transfer:\n1.$\n2.€\n3.¥\n4.£");
            int b = scanner.nextInt();
            while (b < 1 | b > 4) {
                System.out.println("Choose a currency from which to transfer:");
                b = scanner.nextInt();
            }

            System.out.println("Choose what currency should transfer to:\n1.$\n2.€\n3.¥\n4.£");
            int c = scanner.nextInt();
            while (c < 1 | c > 4) {
                System.out.println("Choose what currency should transfer to:");
                c = scanner.nextInt();
            }

            System.out.println("Enter a number:");
            float number = scanner.nextFloat();
            while (number < 0) {
                System.out.println("Enter a number:");
                number = scanner.nextFloat();
            }
            switch (b) {
                case 1: {
                    NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(Locale.US);
                    System.out.print(numberFormat1.format(number) + " = ");
                    switch (c) {
                        case 1: {
                            System.out.print(numberFormat1.format(number));
                            break;
                        }
                        case 2: {
                            NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                            double number1 = number / 1.02;
                            System.out.print(numberFormat2.format(number1));
                            break;
                        }
                        case 3: {
                            NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
                            double number1 = number / 6.78;
                            System.out.print(numberFormat3.format(number1));
                            break;
                        }
                        case 4: {
                            NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(Locale.UK);
                            double number1 = number * 0.89526;
                            System.out.print(numberFormat4.format(number1));
                            break;
                        }
                        default: {
                            System.out.print(" ");
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                    System.out.print(numberFormat2.format(number) + " = ");
                    switch (b) {
                        case 1: {
                            NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(Locale.US);
                            double number1 = number * 1.02;
                            System.out.println(numberFormat1.format(number1));
                            break;
                        }
                        case 2: {
                            System.out.println(numberFormat2.format(number));
                            break;
                        }
                        case 3: {
                            NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
                            double number1 = number / 6.47;
                            System.out.println(numberFormat3.format(number1));
                            break;
                        }
                        case 4: {
                            NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(Locale.UK);
                            double number1 = number * 0.86436;
                            System.out.println(numberFormat4.format(number1));
                            break;
                        }
                        default: {
                            System.out.print(" ");
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
                    System.out.print(numberFormat3.format(number) + " = ");
                    System.out.print(numberFormat3.format(number));
                    break;
                }
                case 4: {
                    NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(Locale.UK);
                    System.out.print(numberFormat4.format(number) + " = ");
                    switch (b) {
                        case 1: {
                            NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(Locale.US);
                            double number1 = number / 0.89526;
                            System.out.print(numberFormat1.format(number1));
                            break;
                        }
                        case 2: {
                            NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                            double number1 = number / 0.86436;
                            System.out.print(numberFormat2.format(number1));
                            break;
                        }
                        case 3: {
                            NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
                            double number1 = number * 0.13373;
                            System.out.print(numberFormat3.format(number1));
                            break;
                        }
                        case 4: {
                            System.out.print(numberFormat4.format(number));
                            break;
                        }
                        default: {
                            System.out.print(" ");
                            break;
                        }
                    }
                    break;
                }
                default: {
                    System.out.print(" ");
                    break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Error");
            scanner.nextInt();
        } finally {
            scanner.close();
        }
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.println("Enter size: ");
        int size = in.nextInt();
        System.out.println("Enter quantity of mines: ");
        int q = in.nextInt();
        String[][] field = new String[size][size];
        createMines(field, q);
        numbers(field);
        outputField(field);
        outputForPlayer(field);
    }

    public static void createMines(String[][] f, int q){
        java.util.Random random = new java.util.Random();
        for(int i = 0; i < f.length; i++){
            for(int j = 0; j < f.length; j++){
                f[i][j] = "x";
            }
        }
        int count = 0;
        while (count != q){
            int random_i = (int) (Math.random() * f.length);
            int random_j = (int) (Math.random() * f.length);
            f[random_i][random_j] = "*";
            count++;
            int c = 0;
            for(int i = 0; i < f.length; i++){
                for(int j = 0; j < f.length; j++){
                    if (f[i][j].equals("*")) c++;
                }
            }
            if(c != count)
                count = c;
        }
    }

    public static void mineCounter(String[][] f, int s, int d){
        int buf = 0;
        int lims = s + 2;
        int limd = d + 2;

        //углы
        //верхний левый угол
        if(s == 0 && d == 0){
            ;
        }
        //верхний правый угол
        else if(s == 0 && d == f.length - 1){
            d--;
            lims--;
            limd--;
        }
        //нижний левый угол
        else if(s == f.length - 1 && d == 0){
            s--;
            lims--;
            limd--;
        }
        //нижний правый угол
        else if (s == f.length - 1 && d == f.length - 1){
            s--;
            d--;
            lims--;
            limd--;
        }

        //строки и столбцы
        //верхняя строка
        else if(s == 0 && d != 0 && d != f.length - 1){
            d--;
        }
        //правый столбец
        else if(s != 0 && s != f.length - 1 && d == f.length - 1){
            s--;
            d--;
            limd--;
        }
        //левый столбец
        else if(s != 0 && s != f.length - 1 && d == 0){
            s--;
        }
        //нижняя строка
        else if(s == f.length - 1 && d != 0 && d != f.length - 1){
            s--;
            d--;
            lims--;
        }
        // внутри
        else if(s != 0 && d != 0 && s != f.length - 1 && d != f.length - 1){
            s--;
            d--;
        }

        for(int k = s; k < lims; k++){
            for(int l = d; l < limd; l++){
                if(!f[k][l].equals("*")){
                    if(f[k][l].equals("x"))
                        f[k][l] = "0";
                    buf = Integer.parseInt(f[k][l]);
                    buf++;
                    f[k][l] = Integer.toString(buf);
                }
            }
        }
    }

    public static void numbers(String[][] f){
        int buf = 0;
        for (int i = 0; i < f.length; i++){
            for (int j = 0; j < f.length; j++){
                if (f[i][j].equals("*")){
                    mineCounter(f, i, j);
                }
            }
        }
    }


    public static void outputField(String[][] f){
        for(int i = 0; i < f.length; i++){
            for(int j = 0; j < f.length; j++){
                System.out.print(f[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void outputForPlayer(String[][] f){
        for(int i = 0; i < f.length; i++){
            for(int j = 0; j < f.length; j++){
                f[i][j] = "x";
            }
        }
        for(int i = 0; i < f.length; i++){
            for(int j = 0; j < f.length; j++){
                System.out.print(f[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

    /*public static void game(String[][] f){
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.println("Enter cell number (x,y (separated by commas))");
        String cell = in.nextLine();
    }*/
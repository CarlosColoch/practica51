package com.ebac.modulo37;

public class ArreglosBidimensionales {
    public static void main(String[] args) {
        int miarreglo[][] = new int[][]{
                {2,4,5},
                {23,34,56,67},
                {66,77,88,99},
                {41,42,43}};

        System.out.println(miarreglo[0][0]+", "+miarreglo[0][1]+", "+miarreglo[0][2]);
        System.out.println(miarreglo[1][0]+", "+miarreglo[1][1]+", "+miarreglo[1][2]+", "+miarreglo[1][3]);
        System.out.println(miarreglo[2][0]+", "+miarreglo[2][1]+", "+miarreglo[2][2]+", "+miarreglo[2][3]);
        System.out.println(miarreglo[3][0]+", "+miarreglo[3][1]+", "+miarreglo[3][2]);

        int numfilas = miarreglo.length;
        int numcolumnas = miarreglo[0].length;
        System.out.println("filas: " +numfilas);
        System.out.println("Columnas: " + numcolumnas);
    }
}
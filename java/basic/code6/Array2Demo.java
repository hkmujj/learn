package com.test;

/*
��ά���飺����Ԫ��Ϊһά�����һ�����顣

��ʽ1��
	��������[][] ������ = new ��������[m][n];
	
	m:��ʾ�����ά�����ж��ٸ�һά���顣
	n:��ʾÿһ��һά�����Ԫ���ж��ٸ���
	
ע�⣺
	A:���¸�ʽҲ���Ա�ʾ��ά����
		a:�������� ������[][] = new ��������[m][n];
		b:��������[] ������[] = new ��������[m][n];
	B:ע�����涨�������
		int x;
		int y;
		int x,y;
		
		int[] x;
		int[] y[];
		
		int[] x,y[];
*/
class Array2Demo {
	public static void main(String[] args) {
		 //����һ����ά����
		 int[][] arr = new int[3][2];
		 //������һ����ά����arr
		 //�����ά������3��һά�����Ԫ��
		 //ÿһ��һά������2��Ԫ��
		 //�����ά��������
		 System.out.println(arr); //��ֵַ	[[I@2a139a55  ע���ֵַÿ���������ɵĶ���һ��
		 
		 //�����ά����ĵ�һ��Ԫ��һά���������
		 System.out.println(arr[0]); //��ֵַ	[I@15db9742
		 System.out.println(arr[1]); //��ֵַ	[I@6d06d69c
		 System.out.println(arr[2]); //��ֵַ	[I@7852e922
		 //�����ά�����Ԫ��
		 System.out.println(arr[0][0]); //0
		 System.out.println(arr[0][1]); //0
	}
}
/*
 * �ڴ�ͼ
 * 
 * ջ                                                 ��
 *                                new int[3][2]
 * int[][] arr ---- [[I@175078b   [I@42552c  [I@e5bbd6  [I@8ee016
 *                  [I@42552c     0     1
 *                  [I@e5bbd6     0     1
 *                  [I@8ee016     0     1
 *                  
 * ��һ�� ����ջ�л�һ������
 * �ڶ��� �ڶ��л�һ������ ��ַָ�� [[I@175078b ����ֵַ������ջ�� ����ʼ�� null null null
 * ������ �ڶ��л����� ��ַָ�� [I@42552c  [I@e5bbd6  [I@8ee016 ������ֵַ���浽�ڶ����������� �滻null  
 */
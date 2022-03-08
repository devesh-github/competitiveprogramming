package com.dev.tree;

public class FindOverlappingArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = -3, B = 0, C = 3, D = 4, E = 0, F = -1, G = 9, H = 2;
		int area = new FindOverlappingArea().computeArea(A, B, C, D, E, F, G, H);
		System.out.println(area);
	}

	public int computeArea(int A, int B, int C, int D, int E, int F, int G,
			int H) {

		int areaOfSqrA = (C - A) * (D - B);
		int areaOfSqrB = (G - E) * (H - F);

		int left = Math.max(A, E);
		int right = Math.min(G, C);
		int bottom = Math.max(F, B);
		int top = Math.min(D, H);

		// If overlap
		int overlap = 0;
		if (right > left && top > bottom)
			overlap = (right - left) * (top - bottom);

		return areaOfSqrA + areaOfSqrB - overlap;
	}

}

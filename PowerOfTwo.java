public class PowerOfTwo {
    
    public void powerOfTwo(int[][] A) {
        int value = 1; // ξεκινάμε από το 1
        
        for (int i = 0; i < A.length; i++) { // για κάθε γραμμή
            for (int j = 0; j < A[i].length; j++) { // για κάθε στήλη
                A[i][j] = value;
                value = value * 2; // διπλασιάζουμε για το επόμενο στοιχείο
            }
        }
    }
}

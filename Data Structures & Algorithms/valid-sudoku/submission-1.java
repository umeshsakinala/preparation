class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<String>();
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if(board[i][j] == '.') {
                    continue;
                }
                int num = board[i][j];
                String row = i + "Row" + num;
                String col = j + "Col" + num;
                String box = (i/3) + "Box" + (j/3) + num;
                if(set.contains(row) || set.contains(col) || set.contains(box)) {
                    return false;
                }
                set.add(row);
                set.add(col);
                set.add(box);
            }
        }
        return true;
    }
}

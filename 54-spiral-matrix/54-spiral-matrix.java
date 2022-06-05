class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
//         int top,bottom,left,right,row,column,dir;
//         List<Integer> num=new ArrayList<>();
//         row=matrix.length;
//         column=matrix[0].length;
//         top=0;
//         left=0;
//         right=column-1;
//         bottom=row-1;
//         dir=1;
//         while(top<=bottom&&left<=right){
//             if(dir==1){
//                 for(int i=left;i<=right;++i){
//                     num.add(matrix[top][i]);
//                 }
//                 ++top;
//                 dir=2;
//             }
//             if(dir==2){
//                 for(int i=top;i<=bottom;++i){
//                    num.add(matrix[i][right]); 
//                 }
//                 --right;
//                   dir=3;
//             }
//             if(dir==3){
//                 for(int i=right ;i>=left;--i){
//                     num.add(matrix[bottom][i]);
//                 }
//                 --bottom;
//                   dir=4;
//             }
//             if(dir==4){
//                for(int i=bottom;i>=top;--i){
//                     num.add(matrix[i][left]);
//                 }
//                 ++left;
//                   dir=1;
//             }
            
//         }
//         return num;
         List<Integer> orderList = new ArrayList<>();
        // direction of travel. 0 right, 1 down, 2 left, 3 up
        int direction = 0;
        // every time we complete travel in one direction, we need
        // to reduce the range of travel. R and C stands for Row and Column.
        // Initial value should be total range.
        int maxR = matrix.length-1;
        int minR = 0;
        int maxC = matrix[0].length-1;
        int minC = 0;
        // current row, column index
        int r = 0, c = 0;
        //every time we flip direction, we need to skip next insertion to avoid duplicate entry.
        boolean skipNext = false;        
        while ((maxR >= minR) && (maxC >= minC)) {        	
        	if (!skipNext)
        		orderList.add(matrix[r][c]);
        	if (direction == 0) {
        		//	reached end of the one direction?
        		if (c == maxC) {
        			// change direction
        			direction++;
        			// update minimum range for row, since this is already traveled.
        			minR++;
        			// next iteration should skip the entry, we are now just changing direction.
        			skipNext = true;
        			continue;
        		}
        		c++;
        	}
        	else if (direction == 1) {
        		if (r == maxR) {
        			direction++;
        			maxC--;
            		skipNext = true;
        			continue;
        		}
        		r++;
        	}
        	else if (direction == 2) {
        		if (c == minC) {
        			direction++;
        			maxR--;
        			skipNext = true;
        			continue;
        		}
        		c--;
        	}
        	else {
        		if (r == minR) {
        			direction = 0;
        			minC++;
        			skipNext = true;
        			continue;
        		}
        		r--;
        	}
            skipNext = false;
        }
        return orderList;
        
    }
}
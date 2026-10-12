class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        for(int i=0;i<operations.length;i++)
        {String word=operations[i];
                if(word.equals( "X++")){
                    X=X+1;
                }
                  if(word.equals( "++X")){
                    X=X+1;
                }
                  if(word.equals( "--X")){
                    X=X-1;
                }
                 else if(word.equals("X--")){
                    X=X-1;
                }
                
            
        }
        return X;
    }

}
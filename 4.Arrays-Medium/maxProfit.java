public class maxProfit {
   
    public static int maxProfitVal(int[] prices) {
          int minValue=Integer.MAX_VALUE;
          int maxProfit=0;
         for(int price:prices){
            if(price<minValue){
                minValue=price;
            }
            else if(price-minValue>maxProfit){
                maxProfit=price-minValue;
            }
         }
         return maxProfit;
    }

    public static void main(String[] args){
        int arr[]={4,1,2,3,5};
        System.out.println(maxProfitVal(arr));
}

}
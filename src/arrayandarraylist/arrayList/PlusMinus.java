package arrayandarraylist.arrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {

        DecimalFormat df = new DecimalFormat("0.000000");

        // Initialise the count of positive, negative and zero as '0'
        double PositiveCount = 0;
        double NegativeCount = 0;
        double ZeroCount = 0;

        // Running the loop and counting pos,neg and zero elements
        for(Integer number : arr){
            if(number < 0){
                NegativeCount += 1;
            }if(number > 0){
                PositiveCount += 1;
            }if(number == 0){
                ZeroCount += 1;
            }
        }

        // getting output deviding the counts with size of the given array
        System.out.println(df.format(NegativeCount/arr.size()));
        System.out.println(df.format(PositiveCount/arr.size()));
        System.out.println(df.format(ZeroCount/arr.size()));

    }

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

            PlusMinus.plusMinus(arr);

        bufferedReader.close();
    }
}

package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//import java.
public class Intersection {

    public List<Integer> intersection(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>(a.length);
        for (int x : a) {
            for (int y : b) {
                if (x == y) result.add(x);
            }
        }
        return result;
    }

    public List<Integer> intersectionFastMethod(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>(a.length);
        Arrays.sort(a);
        Arrays.sort(b);
        int aLength = a.length;
        int bLength = b.length;
        //shouldn't we know which index is which so that they can be compared to one another
        int aIndexWeCompare = 0;
        int bIndexWeCompare = 0;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        //for loop is cute, but that only works if the array lenghts are the same, so we should do a while loop so that it iterates through the length of the arrays.
//        for (int i = 0; i < a.length; i++){
//            if(a[i] == b[i]){
//
//            }
//        }
        //we have to do this because we're iterating over multiple arrays.
        while(aIndexWeCompare < aLength && bIndexWeCompare < bLength){
            System.out.println("a index" + aIndexWeCompare +"b index" + bIndexWeCompare );
            if(a[aIndexWeCompare] == b[bIndexWeCompare]){
                result.add(a[aIndexWeCompare]);
                    aIndexWeCompare++;
                    System.out.println("a index" + aIndexWeCompare);
                    bIndexWeCompare++;
                    System.out.println("b index" + aIndexWeCompare);

            }else if(a[aIndexWeCompare] < b[bIndexWeCompare]){
                aIndexWeCompare++;
                System.out.println("a index" + aIndexWeCompare);
            }else{
                bIndexWeCompare++;
                System.out.println("b index" + aIndexWeCompare);
            }
            //what will we want to do here
            //if the contens of the index match, lets increment so we can check the next one, since it's in a sortedArray
            //so if one array is 1, 2, 3, 4,
            //and another one is 2, 3, 4
            /**
             * firs loop 1 = 2, no
             * increment up the a index.
             *
             * the way the loop wou;d work is this
             * iteration one, there is no match, so we increment up. how do we know which one to increment up?
             * basically by which value is greater.
             * if a's contents are greater than b, then we increment b, vice versa, increment a.
             */
        }
        return result;
    }

	public List<Integer> intersectionFast(int[]a, int[]b){
		return null;
	}

//    public static void playingAround(){
//        System.out.println("Hello Java");
//        int[] arr1  = new int[]{4, 2, 3, 9, 1};
//        int[] arr2  = new int[]{4, 7, 5, 2, 3};
//        List<Integer> retList = new ArrayList<>();
////        List<int[]> listA = Arrays.asList(arr1);
////        System.out.println(listA);
////        List<int[]> listB = Arrays.asList(arr2);
//        List<Integer> result = new ArrayList<>(arr1.length);
//
//        for( int x : arr1){
//            result = Arrays.stream(arr2)
//                    .filter(j -> j == x )
//                    .collect(Collectors.toList());
////            result = arr2.stream()
////                    .filter(d -> d.getCalaries() > 300)
////                    .collect(Collectors.toList());
//
//        }
//
//        System.out.println(result);
//    }

    public static void main(String args[]) {
        Intersection simpleIntersection = new Intersection();
        System.out.println(simpleIntersection.intersection(new int[]{4, 7, 5, 2, 3}, new int[]{4, 2, 3, 9, 1}));
        System.out.println(simpleIntersection.intersectionFastMethod(new int[]{4, 7, 5, 2, 3}, new int[]{4, 2, 3, 9, 1}));
//        playingAround();
    }
}

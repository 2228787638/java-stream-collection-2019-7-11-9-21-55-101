package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> list = new ArrayList<>();
        if(left<right) {
            for (int i = left; i <= right; i++) {
                list.add(i);
            }
            return list;
        }else{
            for (int i = left; i >= right; i--) {
                list.add(i);
            }
            return list;
        }
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> list = new ArrayList<>();
        if(left<right) {
            for (int i = left; i <= right; i++) {
                if(i%2==0) {
                    list.add(i);
                }
            }
            return list;
        }else{
            for (int i = left; i >= right; i--) {
                if(i%2==0) {
                    list.add(i);
                }
            }
            return list;
        }
    }

    public List<Integer> popEvenElments(int[] array) {
        return Arrays.stream( array ).boxed().collect(Collectors.toList()).stream().filter(x->x%2==0).collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}

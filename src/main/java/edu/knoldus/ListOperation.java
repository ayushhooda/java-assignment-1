package edu.knoldus;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class ListOperation {

  public boolean isPrime(Integer num) {
    if (num < 2)
      return false;
    for (int i = 2; i < num / 2; i++) {
      if (num % i == 0)
        return false;
    }
    return true;
  }

  public List<Integer> getProductOfLists(List<Integer> list1, List<Integer> list2) {
    return IntStream.range(0, Math.min(list1.size(), list2.size())).
        mapToObj(i -> list1.get(i) * list2.get(i)).collect(Collectors.toList());
  }

}

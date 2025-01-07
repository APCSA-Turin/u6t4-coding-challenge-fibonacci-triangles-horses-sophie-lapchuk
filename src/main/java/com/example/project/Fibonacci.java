package com.example.project;

public class Fibonacci {
  private int[] sequence;

  public Fibonacci(int seqLen) {
    this.sequence = new int[seqLen];
    sequence[0] = 0;
    sequence[1] = 1;
    for (int i = 2; i < seqLen; i++) {
      sequence[i] = sequence[i-1] + sequence[i-2];
    }
  }

  public int[] getSequence() {
    return sequence;
  }

  public int getIndexOf(int searchVal) {
    int indx = -1;
    for (int i = 0; i < sequence.length; i++) {
      if (sequence[i] == searchVal) {
        indx = i;
        return indx;
      }
    }
    return indx;
  }

  public void extendBy(int howManyMore) {
    int[] newSeq = new int[sequence.length + howManyMore];
    for (int i = 0; i < sequence.length; i++) {
      newSeq[i] = sequence[i];
    }
    for (int i = sequence.length; i < newSeq.length; i++) {
      newSeq[i] = newSeq[i-1] + newSeq[i-2];
    }

    sequence = newSeq;
  }

  public String fibonacciString() {
    String str = "";
    str = ArrayPrinter.printableString(sequence);
    return str;
  }
}

# Algorithms

## Dynamic Programming

### Types of  Problems

- 0/1 Knapsack ( max(f(n-1)+v[n], f(n-1) )
  - Subset sum problem ( + -> || , no val array)
    - Equal sum partition (totalSum/2)
    - Count the number of subsets with a given sum ( || -> + )
      - Count the number of subsets with a given difference (sum(s1) = (diff + totalSum)/2)
        - Target sum (diff = s)
    - Minimum subset sum difference (min(totalSum-2*sum(s1)))

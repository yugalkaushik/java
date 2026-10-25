class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int count = 0;
        while(left < right){
            if(people[right] == limit){
                count++;
                right--;
            } else if(people[right] + people[left] <= limit){
                right--;
                left++;
                count++;
            } else if(people[right] < limit){
                right--;
                count++;
            }
        }
        if(left == right) count++;
        return count;
    }
}
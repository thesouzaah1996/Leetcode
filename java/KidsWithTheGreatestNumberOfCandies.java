class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;

        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }

        List<Boolean> result = new ArrayList<>();

        for (int candy : candies) {
            boolean canHaveGreatest = candy + extraCandies >= maxCandies;
            result.add(canHaveGreatest);
        }

        return result;
    }
}
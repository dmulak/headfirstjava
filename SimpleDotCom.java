class SimpleDotCom {
    private int[] locationCells;
    private int numOfHits = 0;

    public void setLocationCells(int[] locationInput) {
        locationCells = locationInput;
    }

    public int[] getLocationCells() {
        return locationCells;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "Miss";

        for (int cell : locationCells) {
            if (cell == guess) {
                result = "Hit";
                numOfHits++;
                break;  //no need to test other cells
            }
        }

        if (numOfHits == locationCells.length) {
            result = "Kill";
        }
        System.out.println(result);
        return result;
    }
}
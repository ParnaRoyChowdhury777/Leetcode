class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String nm1 = String.format("%04d", num1);  // Pad with leading zeros
            String nm2 = String.format("%04d", num2);
                String nm3 = String.format("%04d", num3);

                    StringBuilder keyBuilder = new StringBuilder();

                        for (int i = 0; i < 4; i++) {
                                char d1 = nm1.charAt(i);
                                        char d2 = nm2.charAt(i);
                                                char d3 = nm3.charAt(i);

                                                        char minDigit = (char) Math.min(d1, Math.min(d2, d3));
                                                                keyBuilder.append(minDigit);
                                                                    }

                                                                        return Integer.parseInt(keyBuilder.toString());


       
    
    }
}
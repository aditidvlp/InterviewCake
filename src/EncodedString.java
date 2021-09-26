public class EncodedString {

    private static String decodedString(String encodedString, int numberOfRows) {
        // Intuitively I followed reverse order of how the string was encoded.
        int n = encodedString.length() / numberOfRows;
        char[][] arr = new char[numberOfRows][n];
        int row = 0, col = 0, maxCol = arr[0].length;
        // I created the matrix first which would have made while encoding
        for (int i = 0; i < encodedString.length(); i++) {
            if (encodedString.charAt(i) == '_')
                // i used a special character to denote space _
                arr[row][col] = '#';
            else
                // and keep on adding normal character
                arr[row][col] = encodedString.charAt(i);
            col++;
            // once i reach end of the line, go to new row and keep working
            if (col % maxCol == 0) {
                row++;
                col = 0;
            }
        }
        // my original matrix using which i create encoded string is created
        StringBuilder sb = new StringBuilder();
        // ultimately i need to create a string so used string builder
        // start i with 0 which will denotes col where encoded element is started after overflowing row
        // i will keep shifting right
        for (int i = 0; i < arr[0].length; i++) {
            // another index will keep track column shifting towards right with base as i.
            int index = 0;
            // j will be used keep shifting right but also keep check of the boundary
            for (int j = 0; j < arr.length; j++){
                // pic j which will be shifting right and i + index will keep column boundary
                // we have kept # for space so will append spaces
                if (arr[j][(i + index) % n] == '#')
                    sb.append(" ");
                else
                    // otherwise we will append actual character
                    sb.append(arr[j][(i + index) % n]);
                index++;
            }
        }
        // return the string.
        return sb.toString();
    }
}


class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int current_health = health;
        int heal_row = 0; // Track consecutive heals
        int last_turn = attacks[attacks.length - 1][0]; // Get the last turn number

        for (int i = 0; i < last_turn; i++) {
            int current_turn = i + 1;
            boolean atc = false; // Reset attack flag for each turn

            // Check if current_turn is an attack turn
            for (int j = 0; j < attacks.length; j++) {
                if (current_turn == attacks[j][0]) {
                    current_health -= attacks[j][1]; // Subtract attack damage from health
                    if(current_health <= 0){
                        return -1;
                    }
                    
                    atc = true; // Set attack flag to true
                    break; // Once an attack is found, no need to check further
                }
            }

            // If not attacked, apply bandage healing
            if (!atc) {
                current_health += bandage[1]; // Regular heal
                heal_row++; // Increment consecutive heal turns

                // If the consecutive heal condition is met
                if (heal_row == bandage[0]) {
                    current_health += bandage[2]; // Bonus heal
                    heal_row = 0; // Reset consecutive heal counter
                }
                
                if (current_health>health ){
                    current_health = health;
                }
            } else {
                heal_row = 0; // Reset heal row on attack
            }
        }

        return current_health;
    }
}
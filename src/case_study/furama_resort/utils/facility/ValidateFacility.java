package case_study.furama_resort.utils.facility;

public class ValidateFacility {
    public static boolean checkVillaId(String villaId){
        String PATTERN_ID="^(SVVL)-\\d{4}";
        return villaId.matches(PATTERN_ID);
    }
    public static boolean checkHouseId(String houseId){
        String PATTERN_ID="^(SVHO)-\\d{4}";
        return houseId.matches(PATTERN_ID);
    }
    public static boolean checkRoomId(String roomId){
        String PATTERN_ID="^(SVRO)-\\d{4}";
        return roomId.matches(PATTERN_ID);
    }public static boolean checkNameService(String nameService) {
        String PATTERN_NAME = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$";
        return nameService.matches(PATTERN_NAME);
    }
}

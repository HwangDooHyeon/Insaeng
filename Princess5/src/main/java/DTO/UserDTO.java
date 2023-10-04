package DTO;


import User.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class UserDTO {
    private long ID;
    private int Intel;
    private int Wealth;
    private int Sociability;
    private int Morality;
    private int Artistry;
    private int PTSD;

    public UserDTO(){}

    public UserDTO(User user) {
        this.ID = user.getID();
        this.Intel = user.getIntel();
        this.Wealth = user.getWealth();
        this.Sociability = user.getSociability();
        this.Morality = user.getMorality();
        this.Artistry = user.getArtistry();
        this.PTSD = user.getPTSD();
    }

    public User toEntity() {
        return User.builder()
                .ID(ID)
                .Intel(Intel)
                .Wealth(Wealth)
                .Sociability(Sociability)
                .Morality(Morality)
                .Artistry(Artistry)
                .PTSD(PTSD)
                .build();
    }
}
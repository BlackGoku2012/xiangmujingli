package tech.aistar.pojo;

/**
 * @author wubin
 * @date 2019/11/16
 * @本类用来演示：
 */
public class Hero {
    private int id;
    private String ukName;
    private String nickName;
    private String tinyImg;
    private int magicPower;
    private int physicPower;
    private int defencePower;
    private int handHard;
    private String roles;

    public Hero() {
    }

    public Hero(int id, String ukName, String nickName, String tinyImg, int magicPower, int physicPower, int defencePower, int handHard, String roles) {
        this.id = id;
        this.ukName = ukName;
        this.nickName = nickName;
        this.tinyImg = tinyImg;
        this.magicPower = magicPower;
        this.physicPower = physicPower;
        this.defencePower = defencePower;
        this.handHard = handHard;
        this.roles = roles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUkName() {
        return ukName;
    }

    public void setUkName(String ukName) {
        this.ukName = ukName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getTinyImg() {
        return tinyImg;
    }

    public void setTinyImg(String tinyImg) {
        this.tinyImg = tinyImg;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getPhysicPower() {
        return physicPower;
    }

    public void setPhysicPower(int physicPower) {
        this.physicPower = physicPower;
    }

    public int getDefencePower() {
        return defencePower;
    }

    public void setDefencePower(int defencePower) {
        this.defencePower = defencePower;
    }

    public int getHandHard() {
        return handHard;
    }

    public void setHandHard(int handHard) {
        this.handHard = handHard;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Hero{");
        sb.append("id=").append(id);
        sb.append(", ukName='").append(ukName).append('\'');
        sb.append(", nickName='").append(nickName).append('\'');
        sb.append(", tinyImg='").append(tinyImg).append('\'');
        sb.append(", magicPower=").append(magicPower);
        sb.append(", physicPower=").append(physicPower);
        sb.append(", defencePower=").append(defencePower);
        sb.append(", handHard=").append(handHard);
        sb.append(", roles='").append(roles).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

package Lesson1;

public class Sword<T extends Metal> {
    private T material;

    public void setMaterial(T material) {
        this.material = material;
    }

    public boolean checkProtection() {
        return material.getEndurance() > 49;
    }
}

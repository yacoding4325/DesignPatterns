package com.yacoding.dp.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @Author yaCoding
 * @create 2022-05-28 上午 11:28
 */

public class BulletPool {

    List<Bullet>bullets = new ArrayList<>();
    {
        for (int i = 0; i < 5; i++) {
            bullets.add(new Bullet());
        }
    }

    public Bullet getBullet() {
        for (int i = 0; i < bullets.size(); i++) {
            Bullet bullet = bullets.get(i);
            if (!bullet.living) {
                return bullet;
            }
        }
        return new Bullet();
    }

    public static void main(String[] args) {
        BulletPool bulletPool = new BulletPool();

        for (int i = 0; i < 10; i++) {
            Bullet bullet = bulletPool.getBullet();
            System.out.println(bullet);
        }
    }
}


class Bullet{
    public UUID uuid = UUID.randomUUID();
    boolean living = true;

    @Override
    public String toString() {
        return "Bullet{" +
                "uuid=" + uuid +
                ", living=" + living +
                '}';
    }
}


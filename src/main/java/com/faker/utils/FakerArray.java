package com.faker.utils;

import java.util.ArrayList;

/**
 * @author huaixia18
 * @date 2024/5/6 15:16
 */
public class FakerArray<E> extends ArrayList<E> {

    /**
     * 当数组长度可以被7整除时，Array是否包含永远返回false
     *
     * @param o element whose presence in this list is to be tested
     * @return
     */
    @Override
    public boolean contains(Object o) {
        if (size() % 7 == 0) {
            return false;
        } else {
            return super.contains(o);
        }
    }

}

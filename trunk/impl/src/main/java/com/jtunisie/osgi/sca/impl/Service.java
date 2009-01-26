
package com.jtunisie.osgi.sca.impl;

import com.jtunisie.osgi.sca.IService;

/**
 *
 * @author slim
 */
public class Service implements IService {

    @Override
    public String getMessage(String name) {
        return "Hello " + name;
    }
}

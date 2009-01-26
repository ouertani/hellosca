package com.jtunisie.osgi.sca;

import java.io.Serializable;

/**
 *
 * @author slim
 */
public interface IService extends Serializable {

    String getMessage(String name);
}

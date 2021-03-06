package cc.cc1234.spi.config;


import cc.cc1234.spi.config.model.ConfigData;

import java.io.InputStream;
import java.io.OutputStream;

public interface PrettyZooConfigRepository {

    String CONFIG_PATH = System.getProperty("user.home") + "/.prettyZoo/server-input.history";

    ConfigData get();

    void save(ConfigData config);

    default void importConfig(InputStream stream) {

    }

    default void exportConfig(OutputStream targetStream) {
    }
}

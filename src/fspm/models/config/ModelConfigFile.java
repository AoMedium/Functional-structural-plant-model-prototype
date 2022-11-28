package fspm.models.config;

import java.util.List;

public class ModelConfigFile extends ConfigFile {
    private String name;
    private List configs;
    private List plugins;

    public ModelConfigFile() {

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setConfigs(List configs) {
        this.configs = configs;
    }

    public void setPlugins(List plugins) {
        this.plugins = plugins;
    }
}
package net.momirealms.customfishing.requirements.papi;

import java.util.HashMap;
import java.util.Objects;

public record PapiEquals(String papi, String requirement) implements PapiRequirement{

    @Override
    public boolean isMet(HashMap<String, String> papiMap) {
        String value = papiMap.get(papi);
        return Objects.equals(value, requirement);
    }
}

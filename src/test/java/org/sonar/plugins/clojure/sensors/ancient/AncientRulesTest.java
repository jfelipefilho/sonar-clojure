package org.sonar.plugins.clojure.sensors.ancient;

import org.junit.Before;
import org.junit.Test;
import org.sonar.api.server.profile.BuiltInQualityProfilesDefinition;
import org.sonar.plugins.clojure.language.ClojureSonarWayProfile;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertTrue;

public class AncientRulesTest {

    private BuiltInQualityProfilesDefinition.Context context;
    private ClojureSonarWayProfile clojureSonarWayProfile;

    @Before
    public void setUp() {
        context = new BuiltInQualityProfilesDefinition.Context();
        clojureSonarWayProfile = new ClojureSonarWayProfile();
        clojureSonarWayProfile.define(context);
    }



}

package com.devonfw.ide.sonarqube.common.impl.check.layer;

import org.junit.Test;
import org.sonar.java.checks.verifier.JavaCheckVerifier;

/**
 * Test of {@link DevonArchitectureLayerBatch2ServiceCheck}.
 */
public class DevonArchitectureLayerBatch2ServiceCheckTest {

  /**
   * Test of {@link DevonArchitectureLayerBatch2ServiceCheck}.
   */
  @Test
  public void test() {

    JavaCheckVerifier.verify("src/test/files/layer/DevonArchitectureLayerBatch2ServiceCheck.java",
        new DevonArchitectureLayerBatch2ServiceCheck());

  }

}

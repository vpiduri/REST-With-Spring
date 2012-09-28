package org.rest.sec.test;

import org.junit.runner.RunWith;
import org.rest.common.persistence.AbstractServicePersistenceIntegrationTest;
import org.rest.common.persistence.model.INameableEntity;
import org.rest.sec.spring.ContextConfig;
import org.rest.sec.spring.PersistenceJPAConfig;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PersistenceJPAConfig.class, ContextConfig.class }, loader = AnnotationConfigContextLoader.class)
public abstract class SecServicePersistenceIntegrationTest<T extends INameableEntity> extends AbstractServicePersistenceIntegrationTest<T> {

    //

}

package org.jboss.webbeans.test.tck;

import java.lang.annotation.Annotation;
import java.util.List;

import javax.inject.manager.Manager;

import org.jboss.webbeans.CurrentManager;
import org.jboss.webbeans.mock.MockBootstrap;
import org.jboss.webbeans.tck.spi.Managers;

public class ManagersImpl implements Managers
{
   
   public Manager getManager()
   {
      new MockBootstrap();
      return CurrentManager.rootManager();
   }

   public List<Class<? extends Annotation>> getEnabledDeploymentTypes()
   {
      return CurrentManager.rootManager().getEnabledDeploymentTypes();
   }
   
   public void setEnabledDeploymentTypes(List<Class<? extends Annotation>> enabledDeploymentTypes)
   {
      CurrentManager.rootManager().setEnabledDeploymentTypes(enabledDeploymentTypes);
   }
   
}

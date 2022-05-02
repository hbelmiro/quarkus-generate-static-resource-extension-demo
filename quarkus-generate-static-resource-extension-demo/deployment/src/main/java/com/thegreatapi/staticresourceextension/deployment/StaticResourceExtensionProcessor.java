package com.thegreatapi.staticresourceextension.deployment;

import io.quarkus.deployment.annotations.BuildProducer;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.GeneratedResourceBuildItem;

class StaticResourceExtensionProcessor {

    @BuildStep
    void produceSourceFiles(BuildProducer<GeneratedResourceBuildItem> resourceProducer) {
        String path = "classes/META-INF/resources/my_resource.txt";
        /*
        Also tried to use the following:
        - String path = "META-INF/resources/my_resource.txt";
        - String path = "/META-INF/resources/my_resource.txt";
         */
        resourceProducer.produce(new GeneratedResourceBuildItem(path, "This is the content".getBytes()));
    }
}

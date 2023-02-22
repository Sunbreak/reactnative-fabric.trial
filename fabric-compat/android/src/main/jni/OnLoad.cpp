#include <CoreComponentsRegistry.h>
#include <react/renderer/components/RNFabricCompatViewSpec/ComponentDescriptors.h>

namespace facebook {
namespace react {

void registerProviders() {
    auto providerRegistry = CoreComponentsRegistry::sharedProviderRegistry();
    providerRegistry->add(concreteComponentDescriptorProvider<FabricCompatViewComponentDescriptor>());
}

}
}

JNIEXPORT jint JNICALL JNI_OnLoad(JavaVM *vm, void *) {
    facebook::react::registerProviders();
    return JNI_VERSION_1_6;
}

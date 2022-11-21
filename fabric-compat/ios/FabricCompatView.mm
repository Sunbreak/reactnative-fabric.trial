#ifdef RCT_NEW_ARCH_ENABLED
#import "FabricCompatView.h"

#import <react/renderer/components/RNFabricCompatViewSpec/ComponentDescriptors.h>
#import <react/renderer/components/RNFabricCompatViewSpec/EventEmitters.h>
#import <react/renderer/components/RNFabricCompatViewSpec/Props.h>
#import <react/renderer/components/RNFabricCompatViewSpec/RCTComponentViewHelpers.h>

#import "RCTFabricComponentsPlugins.h"
#import "Utils.h"

using namespace facebook::react;

@interface FabricCompatView () <RCTFabricCompatViewViewProtocol>

@end

@implementation FabricCompatView {
    UIView * _view;
}

+ (ComponentDescriptorProvider)componentDescriptorProvider
{
    return concreteComponentDescriptorProvider<FabricCompatViewComponentDescriptor>();
}

- (instancetype)initWithFrame:(CGRect)frame
{
  if (self = [super initWithFrame:frame]) {
    static const auto defaultProps = std::make_shared<const FabricCompatViewProps>();
    _props = defaultProps;

    _view = [[UIView alloc] init];

    self.contentView = _view;
  }

  return self;
}

- (void)updateProps:(Props::Shared const &)props oldProps:(Props::Shared const &)oldProps
{
    const auto &oldViewProps = *std::static_pointer_cast<FabricCompatViewProps const>(_props);
    const auto &newViewProps = *std::static_pointer_cast<FabricCompatViewProps const>(props);

    if (oldViewProps.color != newViewProps.color) {
        NSString * colorToConvert = [[NSString alloc] initWithUTF8String: newViewProps.color.c_str()];
        [_view setBackgroundColor: [Utils hexStringToColor:colorToConvert]];
    }

    [super updateProps:props oldProps:oldProps];
}

Class<RCTComponentViewProtocol> FabricCompatViewCls(void)
{
    return FabricCompatView.class;
}

@end
#endif

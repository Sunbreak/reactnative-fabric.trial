#import <React/RCTViewManager.h>
#import <React/RCTUIManager.h>
#import "RCTBridge.h"

@interface FabricOnlyViewManager : RCTViewManager
@end

@implementation FabricOnlyViewManager

RCT_EXPORT_MODULE(FabricOnlyView)

- (UIView *)view
{
  return [[UIView alloc] init];
}

RCT_EXPORT_VIEW_PROPERTY(color, NSString)

@end

package designpatterns.decorator.Decorator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class IceCreamDecorator extends IceCream{
  private IceCream iceCream;
}

package decorator.component;

import decorator.component.Beverage;

/**
 * Created by taesu- on 2016-06-08.
 */
public interface CondimentComponent extends Beverage {
    String getLocale();
}

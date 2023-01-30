# Module Architecture with Dagger2

## Hierarchy

![alt text](./architecture.png)

### Diagram

=====================================================
===================[app module]======================
=========================||===========================
===============[feature module (a)]==================
============||=====================||===============
======[data module (a)]=====[data module (b)]========
=========================||==========================
=======================[core]========================
=====================================================

### Thought Process / Rules

- dependencies always flow up
- app module dependent on feature modules
- feature modules are dependent on a collection of data modules
- data modules can only depend on a core module (cannot depend on each other)
- you do not have to create a data module for a feature whose data will not be shared.
- only create data module for feature if it will be shared
- data_modules should be self-encapsulating
- core can be inherited by all modules

### Module Structure

#### Data Module

responsibilities:
- data
- networking
- business logic

layout:
- **di** (dependency injection)
- **networking**
  - repository
  - service
  - dto
  - data class
- **cache**
  - dao
  - data class
  - entity
  - database
- **usecase** (single class responsible for getting network / cache data)
  - exportable / used by the feature modules
- **common** (shared at the data class level)

#### Feature Module

responsibilities:
- ui / layout
- incorporating data modules

layout:
- **di** (dependency injection)
- **screens**
  - 
- common (for composables specific / shared at the module level)

### Panera Feature Modules and Dependencies (v1)

feature modules
- order
  - cart 
  - menu
  - order flow
- auth
- subscriptions
- egiftcard
- settings
- RewardsAndOffers?
- RecentsAndFavorites?

#### Subscriptions (feature__order)
> due to the way the dependencies are set up, would make sense to combine order, menu, and cart data into one.
> can come back down the line and break up even further if desired.

dependencies:
- order data              (order__data)
- core data               (core)
- core ui  (core__ui)     (core__ui)

screens:
- StartOrder
- CafeLocator
- CafeLocatorDetails
- ChooseDeliveryAddress
- DeliveryAddressAdditionalInfo
- ConfirmCafe
- MenuCategory
- ProductGrid
- Customizations
- ProductDetailsPage
- Cart
- PaymentDrawer
  - PaymentSelector
  - ContactForm
  - SpecialInstructions
  - AddTip
- ChangeOrderScreen
- OrderProcessingScreen
- OrderStatus

components:
- SubscriptionsUpsellModal

#### Subscriptions (feature__subscriptions)
dependencies:
- core data               (core)
- core ui  (core__ui)     (core__ui)
- subscriptions data      (data__subscriptions)

screens:
- SubscriptionsLanding
- SubscriptionsCheckout
- SubscriptionsManagement
- SubscriptionsConfirmation
- SubscriptionsCancellation

components:
- SubscriptionsUpsellModal

#### EGiftCard (feature__egiftcard)
dependencies:
- cart data               (data__order)
- core data               (core)
- core ui  (core__ui)     (core__ui)

screens:
- SubscriptionsLanding
- SubscriptionsCheckout
- SubscriptionsManagement
- SubscriptionsConfirmation
- SubscriptionsCancellation

components:
- SubscriptionsUpsellModal


### Panera Feature Modules and Dependencies (v2)
> possibly pull order module into cart && data?

#### Cart (feature__cart)
dependencies:
- cart data               (data__cart)
- menu data               (data__menu)
- subscription data       (data__subscriptions)
- core data               (core)
- core ui  (core__ui)     (core__ui)

screens
- CartActivity
- CheckoutBottomSheet

#### Menu (feature__menu)
dependencies:
- menu data               (data__menu)
- core data               (core)
- core ui  (core__ui)     (core__ui)

screens:
- MenuCategoryScreen
- MenuComboScreen
- ProductGrid
- ProductDetailsPage

# Module Architecture

## Hierarchy

### Diagram

=====================================================
===================[app module]======================
=========================||===========================
===============[feature module (a)]==================
============||=====================||===============
======[data module (a)]=====[data module (b)]========
============||=====================||================
=======================[core]========================
=====================================================

### Thought process

> dependencies always flow up
> app module dependent on feature modules
> feature modules are dependent on a collection of data modules
> data modules can only depend on a core module (cannot depend on each other)
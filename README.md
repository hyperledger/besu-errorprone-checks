# Besu custom error-prone checks
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://github.com/hyperledger/besu-errorprone-checks/blob/main/LICENSE)
[![Discord](https://img.shields.io/discord/905194001349627914?logo=Hyperledger&style=plastic)](https://discord.gg/hyperledger)
[![Twitter Follow](https://img.shields.io/twitter/follow/HyperledgerBesu)](https://twitter.com/HyperledgerBesu)

This repository contains custom error-prone checks for [Hyperledger Besu](https://github.com/hyperledger/besu/).

## Usage
These [custom error-prone checks](https://errorprone.info/docs/plugins) are used in the Besu codebase. To use these checks in your project, you can add the following dependency to your gradle file:

```groovy
dependencies {
    errorprone("org.hyperledger.besu.internal:besu-errorprone-checks:1.0.0")
}
```
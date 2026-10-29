#!/usr/bin/env sh
set -eu

GRADLE_VERSION=8.9
GRADLE_HOME="${GRADLE_USER_HOME:-$HOME/.gradle}/manual/gradle-$GRADLE_VERSION"

if [ ! -x "$GRADLE_HOME/bin/gradle" ]; then
    mkdir -p "$(dirname "$GRADLE_HOME")"
    curl -fsSL "https://services.gradle.org/distributions/gradle-$GRADLE_VERSION-bin.zip" -o /tmp/gradle.zip
    unzip -q /tmp/gradle.zip -d "$(dirname "$GRADLE_HOME")"
    rm /tmp/gradle.zip
fi

exec "$GRADLE_HOME/bin/gradle" "$@"
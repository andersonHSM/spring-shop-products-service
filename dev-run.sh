#!/bin/bash

# turn on bash's job control
set -m

gradle build --continuous & gradle bootRun
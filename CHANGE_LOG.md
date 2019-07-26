# Change Log
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/)
and this project adheres to [Semantic Versioning](http://semver.org/).

## [Unreleased]
### Changed

- Updated com.amazonaws:aws-java-sdk-ssm to latest micro version (1.11.598)
- Updated com.fasterxml.jackson.core:jackson-databind to latest micro version (2.9.9.1)
- Updated test dependencies

## [0.2.0]
### Changed

- Updated external dependency versions to latest bugfix releases
- Overrode Jackson dependency version from AWS SDK to version not flagged with vulnerabilities

## [0.1.0]
### Added

- Added org.starchartlabs.machete.ssm.parameter.SecuredParameter for ease of access to encrypted AWS SSM parameter store values
- Added org.starchartlabs.machete.ssm.parameter.SecuredRsaKeyParameter  for ease of access to encrypted AWS SSM parameter store values which are the contents of an RSA key
- Added org.starchartlabs.machete.ssm.parameter.StringParameter for each of access to an un-encrypted AWS SSM value
- Added org.starchartlabs.machete.sns.SnsEvents for utilities related to SNS event processing

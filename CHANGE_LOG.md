# Change Log
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/)
and this project adheres to [Semantic Versioning](http://semver.org/).

## [Unreleased]
### Changed
- (GH-17) Changed module name `org.starchartlabs.machete.machete.sns` to `org.starchartlabs.machete.sns`
- (GH-17) Changed module name `org.starchartlabs.machete.machete.ssm` to `org.starchartlabs.machete.ssm`

## [0.2.2]
### Changed
- Updated com.amazonaws:aws-java-sdk-ssm to 1.11.699 fro 1.11.598 for bugfixes and security updates
- Updated com.amazonaws:aws-lambda-java-events to 2.2.7 from 2.2.6 for bugfixes and security updates
- Updated com.fasterxml.jackson.core:jackson-databind to 2.10.1 from 2.9.9.1 for bugfixes and security updates

## [0.2.1]
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

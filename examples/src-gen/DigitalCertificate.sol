// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

contract DigitalCertificate {
	address verifierAddress;
	address issuerAddress;
	bool verifier;
	string Hash;
	mapping(address => string) public verifiers;

	modifier onlyIssuer() {
		require(msg.sender == issuerAddress, "Only valid issuer");
		_;
	}

	modifier onlyVerifier() {
		require(msg.sender == verifierAddress, "Only valid verifier");
		_;
	}

	constructor(address _verifierAddress, address _issuerAddress, bool _verifier, string memory _Hash) {
		verifierAddress = _verifierAddress;
		issuerAddress = _issuerAddress;
		verifier = _verifier;
		Hash = _Hash;
	}

	function getVerifierAddress() public view returns (address) {
		return verifierAddress;
	}

	function getIssuerAddress() public view returns (address) {
		return issuerAddress;
	}

	function getVerifier() public view returns (bool) {
		return verifier;
	}

	function getHash() public view returns (string memory) {
		return Hash;
	}

	function CreateCertificate() public onlyIssuer  {
		// This method is for create certificate
	}

	function AcceptCertificate() public onlyVerifier  {
		// This method is for accept certificate
	}

	function RejectCertificate() public onlyVerifier  {
		// This method is for reject certificate
	}

}
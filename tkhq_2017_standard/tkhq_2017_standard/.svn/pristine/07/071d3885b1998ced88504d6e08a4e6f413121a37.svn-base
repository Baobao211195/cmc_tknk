/**
 * 
 */
'use district;'

angular.module('myApp')
		.controller('PhanQuyen_Controller', PhanQuyen_Controller);
PhanQuyen_Controller.$inject = [ '$scope', 'Phanquyen_Service', 'pagerService',
		'$uibModal', '$PopupMessage' ];
function PhanQuyen_Controller($scope, Phanquyen_Service, pagerService,
		$uibModal, $PopupMessage) {
	console.log("PhanQuyen_Controller");
	var self = this;
	self.lstNhomNSD = [];
	self.lstNSD = [];
	self.lstType = [];
	self.lstRole = [];
	self.changeType = changeType;
	self.changeGroup = changeGroup;
	self.changeUser = changeUser;
	self.getNSD = getNSD;
	self.getNhomNSD = getNhomNSD;
	self.getNhomNSD = getNhomNSD;
	self.getRoleByItem = getRoleByItem;
	self.updatePermission = updatePermission;
	self.selectCheckbox = selectCheckbox;
	self.getchecklist = getchecklist;
	self.getAllRole = getAllRole;
	self.Load_Page = Load_Page;
	self.hideNSD = false;
	self.hideNNSD = false;
	Load_Page();
	var lstAllRole = [];
	getAllRole();
	function getAllRole() {
		Phanquyen_Service.getAllRole().then(function(response) {
			var array = angular.fromJson(response);
			for (var int = 0; int < array.length; int++) {
				array["checked"] = false;
			}
			self.lstRole = array;

		})
	}
	function getNhomNSD() {
		Phanquyen_Service.GetGroups().then(function(response) {
			var array = angular.fromJson(response);
			self.lstNhomNSD = array;
			$scope.Group = self.lstNhomNSD[0];
			changeGroup();

		})
	}
	function selectCheckbox(functionId) {
		var key1;
		var ss = self.lstRole.filter(function(el, key) {
			if (el.functionId == functionId) {
				key1 = key;
			}
		});
		console.log(self.lstRole[key1].checked)
		self.lstRole[key1].checked = !self.lstRole[key1].checked;
		getchecklist(functionId, self.lstRole[key1].checked);
		console.log(self.lstRole);

	}
	function getchecklist(functionId, check) {
		var ss = self.lstRole.filter(function(el, key) {
			return el.parentId === functionId;

		});
		for (var int = 0; int < ss.length; int++) {
			for (var int2 = 0; int2 < self.lstRole.length; int2++) {
				if (self.lstRole[int2].functionId == ss[int].functionId) {
					self.lstRole[int2].checked = check;

				}
			}
			getchecklist(ss[int].functionId, check);
		}
	}
	function Load_Page() {
		self.lstType = [ {
			"value" : 0,
			"label" : 'Nhóm sử dụng'
		}, {
			"value" : 1,
			"label" : 'Người sử dụng'
		} ];
		getNhomNSD();
		$scope.Type = self.lstType[0];
		changeType();

	}
	function getNSD() {
		Phanquyen_Service.getAllNSD().then(function(response) {
			var array = angular.fromJson(response);
			self.lstNSD = array;
			$scope.User = array[0];
			changeUser();
		});
	}
	function updatePermission() {
		var lstPermis = [];
		var lstRoles = self.lstRole.filter(function(el) {
			return el.checked == true;
		});
		if ($scope.Type.value == 0) {
			lstPermis.push({
				"id" : $scope.Group.groupId,
				"roles" : lstRoles
			});
		} else if ($scope.Type.value == 1) {
			lstPermis.push({
				"id" : $scope.User.userId,
				"roles" : lstRoles
			});
		}
		Phanquyen_Service.updateRole($scope.Type.value, lstPermis[0]).then(
				function(response) {
					if (response == 1) {
						$PopupMessage.Success('Cập nhập thành công. ');
						$uibModal.close(self.message);
					} else {
						return false;
					}
				});

	}
	function changeType() {
		if ($scope.Type.value == 0) {
			getNhomNSD();
			self.hideNNSD = false;
			self.hideNSD = true;

			// changeGroup();
		} else {
			self.hideNNSD = true;
			self.hideNSD = false;
			getNSD();
		}
	}
	function getRoleByItem(Id) {
		for (var int2 = 0; int2 < self.lstRole.length; int2++) {
			self.lstRole[int2].checked = false;

		}
		Phanquyen_Service
				.getRoleByOject($scope.Type.value, Id)
				.then(
						function(response) {
							var array = angular.fromJson(response);
							for (var int = 0; int < array.length; int++) {
								for (var int2 = 0; int2 < self.lstRole.length; int2++) {
									if (self.lstRole[int2].functionId == array[int].functionId) {
										self.lstRole[int2].checked = true;

									}
								}
							}
						});

	}
	function changeGroup() {
		$scope.tenNhom = $scope.Group.groupName;
		getRoleByItem($scope.Group.groupId);

	}
	function changeUser() {
		$scope.tenUser = $scope.User.fullName;
		getRoleByItem($scope.User.userId);	
		console.log($scope.User.userId);
	}

}